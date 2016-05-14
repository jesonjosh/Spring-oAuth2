package com.seva.framework.interceptor;

import static com.seva.framework.exception.ExceptionTypes.ACCESS_DENIED_EXCEPTION;
import static com.seva.framework.exception.ExceptionTypes.CONSTRAINT_VIOLATION_EXCEPTION;
import static com.seva.framework.exception.ExceptionTypes.HIBERNATE_EXCEPTION;
import static com.seva.framework.exception.ExceptionTypes.PERSISTENT_EXCEPTION;
import static com.seva.framework.exception.ExceptionTypes.REFERENCE_CONSTRAINT_VIOLATION_EXCEPTION;
import static com.seva.framework.exception.ExceptionTypes.TRANSACTION_EXCEPTION;
import static com.seva.framework.exception.ExceptionTypes.UNIQUE_CONSTRAINT;
import static com.seva.framework.exception.ExceptionTypes.UNIQUE_CONSTRAINT_VIOLATION_EXCEPTION;
import static com.seva.framework.exception.ExceptionTypes.UNSPECIFIED_SYSTEM_EXCEPTION;
import static com.seva.framework.exception.ExceptionTypes.UNSPECIFIED_SYSTEM_THROWABLE;

import javax.persistence.PersistenceException;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
//import org.apache.cxf.interceptor.security.AccessDeniedException;
import org.hibernate.HibernateException;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.transaction.TransactionException;

import com.seva.framework.exception.BusinessException;

public class ExceptionInterceptor implements MethodInterceptor {
	
	public Object invoke(MethodInvocation methodinv) throws Throwable {
		try {
			return methodinv.proceed();
		} catch (BusinessException be) {
			throw be; // If it is BusinessException, then simply rethrow.
		} catch (DataIntegrityViolationException dive) {
			String msg = dive.getMessage();
			String errorCode = REFERENCE_CONSTRAINT_VIOLATION_EXCEPTION;
			if (msg != null && msg.contains(UNIQUE_CONSTRAINT)) {
				errorCode = UNIQUE_CONSTRAINT_VIOLATION_EXCEPTION;
			}
			throw new BusinessException(dive, errorCode);
//		} catch (AccessDeniedException ade) {
//			throw new BusinessException(ade.getMessage(), ade, ACCESS_DENIED_EXCEPTION);
		} catch (PersistenceException pe) {
			throw new BusinessException(pe.getMessage(), pe, PERSISTENT_EXCEPTION);
		} catch (TransactionException te) {
			throw new BusinessException(te.getMessage(), te, TRANSACTION_EXCEPTION);
		} catch (ConstraintViolationException cve) {
			throw new BusinessException(cve.getMessage(), cve, CONSTRAINT_VIOLATION_EXCEPTION);
		} catch (HibernateException he) {
			throw new BusinessException(he.getMessage(), he, HIBERNATE_EXCEPTION);
		} catch (AuthenticationException ae) {
			throw ae; // Not converted in to Business Exception as it is to be handled in spring related class.
		}  catch (Exception e) { 
			throw new BusinessException(e.getMessage(), e, UNSPECIFIED_SYSTEM_EXCEPTION);
		} catch (Throwable t) {
			throw new BusinessException(t.getMessage(), t, UNSPECIFIED_SYSTEM_THROWABLE);
		}
	}
}

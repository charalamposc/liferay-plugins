/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.workflow.kaleo.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;

/**
 * The utility for the kaleo notification local service. This utility wraps {@link com.liferay.portal.workflow.kaleo.service.impl.KaleoNotificationLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * Never modify this class directly. Add custom service methods to {@link com.liferay.portal.workflow.kaleo.service.impl.KaleoNotificationLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KaleoNotificationLocalService
 * @see com.liferay.portal.workflow.kaleo.service.base.KaleoNotificationLocalServiceBaseImpl
 * @see com.liferay.portal.workflow.kaleo.service.impl.KaleoNotificationLocalServiceImpl
 * @generated
 */
public class KaleoNotificationLocalServiceUtil {
	/**
	* Adds the kaleo notification to the database. Also notifies the appropriate model listeners.
	*
	* @param kaleoNotification the kaleo notification to add
	* @return the kaleo notification that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.workflow.kaleo.model.KaleoNotification addKaleoNotification(
		com.liferay.portal.workflow.kaleo.model.KaleoNotification kaleoNotification)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addKaleoNotification(kaleoNotification);
	}

	/**
	* Creates a new kaleo notification with the primary key. Does not add the kaleo notification to the database.
	*
	* @param kaleoNotificationId the primary key for the new kaleo notification
	* @return the new kaleo notification
	*/
	public static com.liferay.portal.workflow.kaleo.model.KaleoNotification createKaleoNotification(
		long kaleoNotificationId) {
		return getService().createKaleoNotification(kaleoNotificationId);
	}

	/**
	* Deletes the kaleo notification with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param kaleoNotificationId the primary key of the kaleo notification to delete
	* @throws PortalException if a kaleo notification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteKaleoNotification(long kaleoNotificationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteKaleoNotification(kaleoNotificationId);
	}

	/**
	* Deletes the kaleo notification from the database. Also notifies the appropriate model listeners.
	*
	* @param kaleoNotification the kaleo notification to delete
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteKaleoNotification(
		com.liferay.portal.workflow.kaleo.model.KaleoNotification kaleoNotification)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteKaleoNotification(kaleoNotification);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the kaleo notification with the primary key.
	*
	* @param kaleoNotificationId the primary key of the kaleo notification to get
	* @return the kaleo notification
	* @throws PortalException if a kaleo notification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.workflow.kaleo.model.KaleoNotification getKaleoNotification(
		long kaleoNotificationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getKaleoNotification(kaleoNotificationId);
	}

	/**
	* Gets a range of all the kaleo notifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of kaleo notifications to return
	* @param end the upper bound of the range of kaleo notifications to return (not inclusive)
	* @return the range of kaleo notifications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoNotification> getKaleoNotifications(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getKaleoNotifications(start, end);
	}

	/**
	* Gets the number of kaleo notifications.
	*
	* @return the number of kaleo notifications
	* @throws SystemException if a system exception occurred
	*/
	public static int getKaleoNotificationsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getKaleoNotificationsCount();
	}

	/**
	* Updates the kaleo notification in the database. Also notifies the appropriate model listeners.
	*
	* @param kaleoNotification the kaleo notification to update
	* @return the kaleo notification that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.workflow.kaleo.model.KaleoNotification updateKaleoNotification(
		com.liferay.portal.workflow.kaleo.model.KaleoNotification kaleoNotification)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateKaleoNotification(kaleoNotification);
	}

	/**
	* Updates the kaleo notification in the database. Also notifies the appropriate model listeners.
	*
	* @param kaleoNotification the kaleo notification to update
	* @param merge whether to merge the kaleo notification with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the kaleo notification that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.workflow.kaleo.model.KaleoNotification updateKaleoNotification(
		com.liferay.portal.workflow.kaleo.model.KaleoNotification kaleoNotification,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateKaleoNotification(kaleoNotification, merge);
	}

	public static com.liferay.portal.workflow.kaleo.model.KaleoNotification addKaleoNotification(
		long kaleoDefinitionId, long kaleoNodeId,
		java.lang.String kaleoNodeName,
		com.liferay.portal.workflow.kaleo.definition.Notification notification,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addKaleoNotification(kaleoDefinitionId, kaleoNodeId,
			kaleoNodeName, notification, serviceContext);
	}

	public static void deleteCompanyKaleoNotifications(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteCompanyKaleoNotifications(companyId);
	}

	public static void deleteKaleoDefinitionKaleoNotifications(
		long kaleoDefinitionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteKaleoDefinitionKaleoNotifications(kaleoDefinitionId);
	}

	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoNotification> getKaleoNotifications(
		long kaleoNodeId, java.lang.String executionType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getKaleoNotifications(kaleoNodeId, executionType);
	}

	public static void clearService() {
		_service = null;
	}

	public static KaleoNotificationLocalService getService() {
		if (_service == null) {
			Object obj = PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					KaleoNotificationLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(obj,
					portletClassLoader);

			_service = new KaleoNotificationLocalServiceClp(KaleoNotificationLocalService.class.getName(),
					classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);
		}

		return _service;
	}

	public void setService(KaleoNotificationLocalService service) {
		_service = service;
	}

	private static KaleoNotificationLocalService _service;
}
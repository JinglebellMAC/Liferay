package ie.deloitte.sample.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Samplebook. This utility wraps
 * {@link ie.deloitte.sample.service.impl.SamplebookLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author JY
 * @see SamplebookLocalService
 * @see ie.deloitte.sample.service.base.SamplebookLocalServiceBaseImpl
 * @see ie.deloitte.sample.service.impl.SamplebookLocalServiceImpl
 * @generated
 */
public class SamplebookLocalServiceUtil {
    private static SamplebookLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link ie.deloitte.sample.service.impl.SamplebookLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the samplebook to the database. Also notifies the appropriate model listeners.
    *
    * @param samplebook the samplebook
    * @return the samplebook that was added
    * @throws SystemException if a system exception occurred
    */
    public static ie.deloitte.sample.model.Samplebook addSamplebook(
        ie.deloitte.sample.model.Samplebook samplebook)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addSamplebook(samplebook);
    }

    /**
    * Creates a new samplebook with the primary key. Does not add the samplebook to the database.
    *
    * @param guestbookId the primary key for the new samplebook
    * @return the new samplebook
    */
    public static ie.deloitte.sample.model.Samplebook createSamplebook(
        long guestbookId) {
        return getService().createSamplebook(guestbookId);
    }

    /**
    * Deletes the samplebook with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param guestbookId the primary key of the samplebook
    * @return the samplebook that was removed
    * @throws PortalException if a samplebook with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ie.deloitte.sample.model.Samplebook deleteSamplebook(
        long guestbookId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteSamplebook(guestbookId);
    }

    /**
    * Deletes the samplebook from the database. Also notifies the appropriate model listeners.
    *
    * @param samplebook the samplebook
    * @return the samplebook that was removed
    * @throws SystemException if a system exception occurred
    */
    public static ie.deloitte.sample.model.Samplebook deleteSamplebook(
        ie.deloitte.sample.model.Samplebook samplebook)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteSamplebook(samplebook);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ie.deloitte.sample.model.impl.SamplebookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ie.deloitte.sample.model.impl.SamplebookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
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
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static ie.deloitte.sample.model.Samplebook fetchSamplebook(
        long guestbookId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchSamplebook(guestbookId);
    }

    /**
    * Returns the samplebook with the matching UUID and company.
    *
    * @param uuid the samplebook's UUID
    * @param companyId the primary key of the company
    * @return the matching samplebook, or <code>null</code> if a matching samplebook could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ie.deloitte.sample.model.Samplebook fetchSamplebookByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchSamplebookByUuidAndCompanyId(uuid, companyId);
    }

    /**
    * Returns the samplebook matching the UUID and group.
    *
    * @param uuid the samplebook's UUID
    * @param groupId the primary key of the group
    * @return the matching samplebook, or <code>null</code> if a matching samplebook could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ie.deloitte.sample.model.Samplebook fetchSamplebookByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchSamplebookByUuidAndGroupId(uuid, groupId);
    }

    /**
    * Returns the samplebook with the primary key.
    *
    * @param guestbookId the primary key of the samplebook
    * @return the samplebook
    * @throws PortalException if a samplebook with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ie.deloitte.sample.model.Samplebook getSamplebook(
        long guestbookId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getSamplebook(guestbookId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns the samplebook with the matching UUID and company.
    *
    * @param uuid the samplebook's UUID
    * @param companyId the primary key of the company
    * @return the matching samplebook
    * @throws PortalException if a matching samplebook could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ie.deloitte.sample.model.Samplebook getSamplebookByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getSamplebookByUuidAndCompanyId(uuid, companyId);
    }

    /**
    * Returns the samplebook matching the UUID and group.
    *
    * @param uuid the samplebook's UUID
    * @param groupId the primary key of the group
    * @return the matching samplebook
    * @throws PortalException if a matching samplebook could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ie.deloitte.sample.model.Samplebook getSamplebookByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getSamplebookByUuidAndGroupId(uuid, groupId);
    }

    /**
    * Returns a range of all the samplebooks.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ie.deloitte.sample.model.impl.SamplebookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of samplebooks
    * @param end the upper bound of the range of samplebooks (not inclusive)
    * @return the range of samplebooks
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ie.deloitte.sample.model.Samplebook> getSamplebooks(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getSamplebooks(start, end);
    }

    /**
    * Returns the number of samplebooks.
    *
    * @return the number of samplebooks
    * @throws SystemException if a system exception occurred
    */
    public static int getSamplebooksCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getSamplebooksCount();
    }

    /**
    * Updates the samplebook in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param samplebook the samplebook
    * @return the samplebook that was updated
    * @throws SystemException if a system exception occurred
    */
    public static ie.deloitte.sample.model.Samplebook updateSamplebook(
        ie.deloitte.sample.model.Samplebook samplebook)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateSamplebook(samplebook);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static void clearService() {
        _service = null;
    }

    public static SamplebookLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    SamplebookLocalService.class.getName());

            if (invokableLocalService instanceof SamplebookLocalService) {
                _service = (SamplebookLocalService) invokableLocalService;
            } else {
                _service = new SamplebookLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(SamplebookLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(SamplebookLocalService service) {
    }
}

package ie.deloitte.sample.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SamplebookLocalService}.
 *
 * @author JY
 * @see SamplebookLocalService
 * @generated
 */
public class SamplebookLocalServiceWrapper implements SamplebookLocalService,
    ServiceWrapper<SamplebookLocalService> {
    private SamplebookLocalService _samplebookLocalService;

    public SamplebookLocalServiceWrapper(
        SamplebookLocalService samplebookLocalService) {
        _samplebookLocalService = samplebookLocalService;
    }

    /**
    * Adds the samplebook to the database. Also notifies the appropriate model listeners.
    *
    * @param samplebook the samplebook
    * @return the samplebook that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ie.deloitte.sample.model.Samplebook addSamplebook(
        ie.deloitte.sample.model.Samplebook samplebook)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _samplebookLocalService.addSamplebook(samplebook);
    }

    /**
    * Creates a new samplebook with the primary key. Does not add the samplebook to the database.
    *
    * @param guestbookId the primary key for the new samplebook
    * @return the new samplebook
    */
    @Override
    public ie.deloitte.sample.model.Samplebook createSamplebook(
        long guestbookId) {
        return _samplebookLocalService.createSamplebook(guestbookId);
    }

    /**
    * Deletes the samplebook with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param guestbookId the primary key of the samplebook
    * @return the samplebook that was removed
    * @throws PortalException if a samplebook with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ie.deloitte.sample.model.Samplebook deleteSamplebook(
        long guestbookId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _samplebookLocalService.deleteSamplebook(guestbookId);
    }

    /**
    * Deletes the samplebook from the database. Also notifies the appropriate model listeners.
    *
    * @param samplebook the samplebook
    * @return the samplebook that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ie.deloitte.sample.model.Samplebook deleteSamplebook(
        ie.deloitte.sample.model.Samplebook samplebook)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _samplebookLocalService.deleteSamplebook(samplebook);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _samplebookLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _samplebookLocalService.dynamicQuery(dynamicQuery);
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
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _samplebookLocalService.dynamicQuery(dynamicQuery, start, end);
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
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _samplebookLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _samplebookLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _samplebookLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public ie.deloitte.sample.model.Samplebook fetchSamplebook(long guestbookId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _samplebookLocalService.fetchSamplebook(guestbookId);
    }

    /**
    * Returns the samplebook with the matching UUID and company.
    *
    * @param uuid the samplebook's UUID
    * @param companyId the primary key of the company
    * @return the matching samplebook, or <code>null</code> if a matching samplebook could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ie.deloitte.sample.model.Samplebook fetchSamplebookByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _samplebookLocalService.fetchSamplebookByUuidAndCompanyId(uuid,
            companyId);
    }

    /**
    * Returns the samplebook matching the UUID and group.
    *
    * @param uuid the samplebook's UUID
    * @param groupId the primary key of the group
    * @return the matching samplebook, or <code>null</code> if a matching samplebook could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ie.deloitte.sample.model.Samplebook fetchSamplebookByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _samplebookLocalService.fetchSamplebookByUuidAndGroupId(uuid,
            groupId);
    }

    /**
    * Returns the samplebook with the primary key.
    *
    * @param guestbookId the primary key of the samplebook
    * @return the samplebook
    * @throws PortalException if a samplebook with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ie.deloitte.sample.model.Samplebook getSamplebook(long guestbookId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _samplebookLocalService.getSamplebook(guestbookId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _samplebookLocalService.getPersistedModel(primaryKeyObj);
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
    @Override
    public ie.deloitte.sample.model.Samplebook getSamplebookByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _samplebookLocalService.getSamplebookByUuidAndCompanyId(uuid,
            companyId);
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
    @Override
    public ie.deloitte.sample.model.Samplebook getSamplebookByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _samplebookLocalService.getSamplebookByUuidAndGroupId(uuid,
            groupId);
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
    @Override
    public java.util.List<ie.deloitte.sample.model.Samplebook> getSamplebooks(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _samplebookLocalService.getSamplebooks(start, end);
    }

    /**
    * Returns the number of samplebooks.
    *
    * @return the number of samplebooks
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getSamplebooksCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _samplebookLocalService.getSamplebooksCount();
    }

    /**
    * Updates the samplebook in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param samplebook the samplebook
    * @return the samplebook that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ie.deloitte.sample.model.Samplebook updateSamplebook(
        ie.deloitte.sample.model.Samplebook samplebook)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _samplebookLocalService.updateSamplebook(samplebook);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _samplebookLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _samplebookLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _samplebookLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public SamplebookLocalService getWrappedSamplebookLocalService() {
        return _samplebookLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedSamplebookLocalService(
        SamplebookLocalService samplebookLocalService) {
        _samplebookLocalService = samplebookLocalService;
    }

    @Override
    public SamplebookLocalService getWrappedService() {
        return _samplebookLocalService;
    }

    @Override
    public void setWrappedService(SamplebookLocalService samplebookLocalService) {
        _samplebookLocalService = samplebookLocalService;
    }
}

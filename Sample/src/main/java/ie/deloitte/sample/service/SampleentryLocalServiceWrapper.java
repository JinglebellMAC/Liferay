package ie.deloitte.sample.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SampleentryLocalService}.
 *
 * @author JY
 * @see SampleentryLocalService
 * @generated
 */
public class SampleentryLocalServiceWrapper implements SampleentryLocalService,
    ServiceWrapper<SampleentryLocalService> {
    private SampleentryLocalService _sampleentryLocalService;

    public SampleentryLocalServiceWrapper(
        SampleentryLocalService sampleentryLocalService) {
        _sampleentryLocalService = sampleentryLocalService;
    }

    /**
    * Adds the sampleentry to the database. Also notifies the appropriate model listeners.
    *
    * @param sampleentry the sampleentry
    * @return the sampleentry that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ie.deloitte.sample.model.Sampleentry addSampleentry(
        ie.deloitte.sample.model.Sampleentry sampleentry)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _sampleentryLocalService.addSampleentry(sampleentry);
    }

    /**
    * Creates a new sampleentry with the primary key. Does not add the sampleentry to the database.
    *
    * @param entryId the primary key for the new sampleentry
    * @return the new sampleentry
    */
    @Override
    public ie.deloitte.sample.model.Sampleentry createSampleentry(long entryId) {
        return _sampleentryLocalService.createSampleentry(entryId);
    }

    /**
    * Deletes the sampleentry with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param entryId the primary key of the sampleentry
    * @return the sampleentry that was removed
    * @throws PortalException if a sampleentry with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ie.deloitte.sample.model.Sampleentry deleteSampleentry(long entryId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _sampleentryLocalService.deleteSampleentry(entryId);
    }

    /**
    * Deletes the sampleentry from the database. Also notifies the appropriate model listeners.
    *
    * @param sampleentry the sampleentry
    * @return the sampleentry that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ie.deloitte.sample.model.Sampleentry deleteSampleentry(
        ie.deloitte.sample.model.Sampleentry sampleentry)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _sampleentryLocalService.deleteSampleentry(sampleentry);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _sampleentryLocalService.dynamicQuery();
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
        return _sampleentryLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ie.deloitte.sample.model.impl.SampleentryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _sampleentryLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ie.deloitte.sample.model.impl.SampleentryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _sampleentryLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _sampleentryLocalService.dynamicQueryCount(dynamicQuery);
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
        return _sampleentryLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public ie.deloitte.sample.model.Sampleentry fetchSampleentry(long entryId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _sampleentryLocalService.fetchSampleentry(entryId);
    }

    /**
    * Returns the sampleentry with the matching UUID and company.
    *
    * @param uuid the sampleentry's UUID
    * @param companyId the primary key of the company
    * @return the matching sampleentry, or <code>null</code> if a matching sampleentry could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ie.deloitte.sample.model.Sampleentry fetchSampleentryByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _sampleentryLocalService.fetchSampleentryByUuidAndCompanyId(uuid,
            companyId);
    }

    /**
    * Returns the sampleentry matching the UUID and group.
    *
    * @param uuid the sampleentry's UUID
    * @param groupId the primary key of the group
    * @return the matching sampleentry, or <code>null</code> if a matching sampleentry could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ie.deloitte.sample.model.Sampleentry fetchSampleentryByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _sampleentryLocalService.fetchSampleentryByUuidAndGroupId(uuid,
            groupId);
    }

    /**
    * Returns the sampleentry with the primary key.
    *
    * @param entryId the primary key of the sampleentry
    * @return the sampleentry
    * @throws PortalException if a sampleentry with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ie.deloitte.sample.model.Sampleentry getSampleentry(long entryId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _sampleentryLocalService.getSampleentry(entryId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _sampleentryLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns the sampleentry with the matching UUID and company.
    *
    * @param uuid the sampleentry's UUID
    * @param companyId the primary key of the company
    * @return the matching sampleentry
    * @throws PortalException if a matching sampleentry could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ie.deloitte.sample.model.Sampleentry getSampleentryByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _sampleentryLocalService.getSampleentryByUuidAndCompanyId(uuid,
            companyId);
    }

    /**
    * Returns the sampleentry matching the UUID and group.
    *
    * @param uuid the sampleentry's UUID
    * @param groupId the primary key of the group
    * @return the matching sampleentry
    * @throws PortalException if a matching sampleentry could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ie.deloitte.sample.model.Sampleentry getSampleentryByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _sampleentryLocalService.getSampleentryByUuidAndGroupId(uuid,
            groupId);
    }

    /**
    * Returns a range of all the sampleentries.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ie.deloitte.sample.model.impl.SampleentryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of sampleentries
    * @param end the upper bound of the range of sampleentries (not inclusive)
    * @return the range of sampleentries
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<ie.deloitte.sample.model.Sampleentry> getSampleentries(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _sampleentryLocalService.getSampleentries(start, end);
    }

    /**
    * Returns the number of sampleentries.
    *
    * @return the number of sampleentries
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getSampleentriesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _sampleentryLocalService.getSampleentriesCount();
    }

    /**
    * Updates the sampleentry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param sampleentry the sampleentry
    * @return the sampleentry that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ie.deloitte.sample.model.Sampleentry updateSampleentry(
        ie.deloitte.sample.model.Sampleentry sampleentry)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _sampleentryLocalService.updateSampleentry(sampleentry);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _sampleentryLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _sampleentryLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _sampleentryLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public SampleentryLocalService getWrappedSampleentryLocalService() {
        return _sampleentryLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedSampleentryLocalService(
        SampleentryLocalService sampleentryLocalService) {
        _sampleentryLocalService = sampleentryLocalService;
    }

    @Override
    public SampleentryLocalService getWrappedService() {
        return _sampleentryLocalService;
    }

    @Override
    public void setWrappedService(
        SampleentryLocalService sampleentryLocalService) {
        _sampleentryLocalService = sampleentryLocalService;
    }
}

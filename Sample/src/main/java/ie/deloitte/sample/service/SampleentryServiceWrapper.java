package ie.deloitte.sample.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SampleentryService}.
 *
 * @author JY
 * @see SampleentryService
 * @generated
 */
public class SampleentryServiceWrapper implements SampleentryService,
    ServiceWrapper<SampleentryService> {
    private SampleentryService _sampleentryService;

    public SampleentryServiceWrapper(SampleentryService sampleentryService) {
        _sampleentryService = sampleentryService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _sampleentryService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _sampleentryService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _sampleentryService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public SampleentryService getWrappedSampleentryService() {
        return _sampleentryService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedSampleentryService(
        SampleentryService sampleentryService) {
        _sampleentryService = sampleentryService;
    }

    @Override
    public SampleentryService getWrappedService() {
        return _sampleentryService;
    }

    @Override
    public void setWrappedService(SampleentryService sampleentryService) {
        _sampleentryService = sampleentryService;
    }
}

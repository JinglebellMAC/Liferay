package ie.deloitte.sample.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import ie.deloitte.sample.model.Sampleentry;
import ie.deloitte.sample.service.SampleentryLocalServiceUtil;

/**
 * @author JY
 * @generated
 */
public abstract class SampleentryActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public SampleentryActionableDynamicQuery() throws SystemException {
        setBaseLocalService(SampleentryLocalServiceUtil.getService());
        setClass(Sampleentry.class);

        setClassLoader(ie.deloitte.sample.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("entryId");
    }
}

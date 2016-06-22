package ie.deloitte.sample.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import ie.deloitte.sample.model.Samplebook;
import ie.deloitte.sample.service.SamplebookLocalServiceUtil;

/**
 * @author JY
 * @generated
 */
public abstract class SamplebookActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public SamplebookActionableDynamicQuery() throws SystemException {
        setBaseLocalService(SamplebookLocalServiceUtil.getService());
        setClass(Samplebook.class);

        setClassLoader(ie.deloitte.sample.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("guestbookId");
    }
}

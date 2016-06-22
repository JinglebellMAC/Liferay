package ie.deloitte.sample.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import ie.deloitte.sample.service.ClpSerializer;
import ie.deloitte.sample.service.SamplebookLocalServiceUtil;
import ie.deloitte.sample.service.SampleentryLocalServiceUtil;
import ie.deloitte.sample.service.SampleentryServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            SamplebookLocalServiceUtil.clearService();

            SampleentryLocalServiceUtil.clearService();

            SampleentryServiceUtil.clearService();
        }
    }
}

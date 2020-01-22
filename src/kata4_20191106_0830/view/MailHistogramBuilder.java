package kata4_20191106_0830.view;

import java.util.List;
import kata4_20191106_0830.model.Histogram;
import kata4_20191106_0830.model.Mail;

public class MailHistogramBuilder {

    public static Histogram build(List<Mail> mailList) {
        Histogram<String> histogram = new Histogram<>();
        
        for (Mail mail : mailList) 
            histogram.increment(mail.getDomain());
        
        return histogram;
    }
    
}

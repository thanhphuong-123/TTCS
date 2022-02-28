package tran.tuananh.movie.Service;

import tran.tuananh.movie.Table.Request.SmsRequest;
import tran.tuananh.movie.Table.Response.Response;

public interface SmsService {

    Response sendMessage(SmsRequest smsRequest);
}

package tran.tuananh.movie.Kafka.Listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import tran.tuananh.movie.Service.EmailService;
import tran.tuananh.movie.Table.Response.VerifyResponse;

import java.util.List;

@Component
public class KafkaListeners {

    private final Logger logger = LogManager.getLogger(KafkaListeners.class);

    @Autowired
    private EmailService emailService;

    @Autowired
    private KafkaTemplate<Object, Object> kafkaTemplate;

    @KafkaListener(topics = "movie.verify_user", containerFactory = "verifyResponseContainerFactory")
    public void verifyUser(@Payload List<ConsumerRecord<String, VerifyResponse>> list, Acknowledgment ack) {
        try {
            for (ConsumerRecord<String, VerifyResponse> record : list) {
                VerifyResponse verifyResponse = record.value();
                emailService.sendEmail(verifyResponse.getEmail(), verifyResponse.getUsername(),
                    verifyResponse.getToken());
            }
        } catch (Exception e) {
            kafkaTemplate.send("movie.verify_user_error", e.getMessage());
            logger.error(e);
        }
        ack.acknowledge();
    }
}

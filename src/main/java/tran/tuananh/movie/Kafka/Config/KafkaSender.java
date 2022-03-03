package tran.tuananh.movie.Kafka.Config;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaSender {

    private final KafkaTemplate<Object, Object> kafkaTemplate;

    @Autowired
    KafkaSender(KafkaTemplate<Object, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendProducerRecord(ProducerRecord<Object, Object> producerRecord){
        kafkaTemplate.send(producerRecord);
    }
}

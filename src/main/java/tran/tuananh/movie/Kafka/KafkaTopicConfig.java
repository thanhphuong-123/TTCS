package tran.tuananh.movie.Kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic MovieVerifyUserTopic() {
        return TopicBuilder.name("movie.verify_user").build();
    }

    @Bean
    public NewTopic MovieVerifyUserErrorTopic() {
        return TopicBuilder.name("movie.verify_user_error").build();
    }
}

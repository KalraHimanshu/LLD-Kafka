 **Entities**:
1. **Broker**: Singleton, Having responsibiities to 
   1. initiate kafka.
2. **Client**: As a Plugger 
   1. to connect Producers & Consumers with Kafka Broker... 
3. **Topic** : 
   1. to store Messages & 
   2. parallely access messages without blocking...
4. **Message**: 
   1. Store Data 
   2. we have also introduce **Key** to calc Hashfunc to implement Multiple Partitions func for future...
5. **Consumer**: 
   1. To Consume message
   2. subscribe to topic
   3. store diff offsets for all subscribed topics
6. **Producer**: 
   1. Connect with Client and Produce Message...

**Suggested Improvements by me:**

1. We can Define the Interfaces to have different Implementations, like in Topic Interface: we can have concurrentv access defined here as a diff implementation.
Producer, Consumer: Interface

2. Factory Pattern to initiate multiple Consumers/ Producers
3. Command Pattern can be used in Consumers to define main functionality with diff Implemmentations.

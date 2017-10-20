# java9-samples

## API changes

1. Stream API:
   1. iterate-filter-consumer
   2. Stream vs Optional: Optional is a special kind of stream
2. process API
3. HTTP Client API: implements HTTP/2 & WebSocket
## New language features
JEP 213: 
1. http://openjdk.java.net/jeps/213
2. http://docs.oracle.com/javase/9/whatsnew/toc.htm#JSNEW-GUID-825576B5-203C-4C8D-85E5-FFDA4CA0B34
* Convenience Factory Methods for Collections
## New Deployment strategy
1. Java 8 vs Java 9 ways, memory footprints
## What's deprecated
## Tech debt
1. Current naming convention of samples doesn't scale; needs a round of refactoring
2. Interplay between LOGGER and sysout is turning out to be hairy; refactor
3. The stream examples are all in one class, should be in a package of their own

## continue here
1. https://stackoverflow.com/questions/20746429/limit-a-stream-by-a-predicate

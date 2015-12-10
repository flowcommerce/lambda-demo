# lambda-demo

First attempt to create lambda function in Scala

# steps
- sbt compile assembly
- create new lambda function in console
- zip relevant jars
- use Java 8 and upload zip

# Sample Calls to AWS Api Gateway

GET Request:
```
[paolo @ ~] > curl https://yzbz97tox5.execute-api.us-east-1.amazonaws.com/test/mydemoresource \
>   -X GET
{"Hello":"World"}
```

POST Request:
```
[paolo @ ~] > curl https://yzbz97tox5.execute-api.us-east-1.amazonaws.com/test/mydemoresource \
>   --header "x-api-key: FkzZAMmzjYUgL5JG4eCq6r10eB0Qrks6ML2b2DP7" \
>   --data '{"key1":"One", "key2":"Two", "key3":"Three"}' \
>   -X POST
{"key1":"One","key2":"Two","key3":"Three"}
```


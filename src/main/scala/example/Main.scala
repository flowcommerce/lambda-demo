package example

//import com.amazonaws.services.lambda.runtime.Context

/* Hello World in AWS Lambda -
{
  "key3": "value3",
  "key2": "value2",
  "key1": "value1"
}
*/

// Case class doesn't seem to work
// POJO-like for now - lambda looks for explicit getters and setters
class RequestClass {
  var key1: String = ""
  var key2: String = ""
  var key3: String = ""

  def getKey1(): String = key1
  def getKey2(): String = key2
  def getKey3(): String = key3

  def setKey1(s: String) { key1 = s }
  def setKey2(s: String) { key2 = s }
  def setKey3(s: String) { key3 = s }
}

class ResponseClass(val key1: String, val key2: String, val key3: String) {
  def getKey1(): String = key1
  def getKey2(): String = key2
  def getKey3(): String = key3
}

// Actual thing called
class Main {
  def sayHelloAgain(req: RequestClass): ResponseClass = {
    return new ResponseClass(req.key1, req.key2, req.key3)
  }

  def sayHello(): String = {
    val x = """{"Hello":"Name"}"""
    return x
  }
}


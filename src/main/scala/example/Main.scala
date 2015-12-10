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
//case class RequestClass(key1: String, key2: String, key3: String)

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

// Actual thing called
class Main {
  def sayHelloAgain(req: RequestClass): String = {
    val x = "key1: " + req.key1 + ", key2: " + req.key2 + ", key3: " + req.key3
    return x
  }

  def sayHello(): String = {
    val x = """{"Hello":"Name"}"""
    return x
  }
}


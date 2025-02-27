//commands to enter the data

//input
//output

//val <variables> = data Types

fun main()// calling program; fun is a function
{
  print("\n survey form for ABC Telco internet perfomance")
  
  print("\n Enter respondents name:")
  val name = readLine()
  
  //display the output
  
  print("\n your name is $name ")
  
  print("\n")
  print("\n From 1 to 5 rate the following service")
  val i = readLine()?.toIntOrNull() ?:0
   print("\n How you satisfied with our website usability?")
  val y = readLine()?.toIntOrNull() ?:0
  print("\n")
  print("\n How likely are you to recommend our service?")
  val u = readLine()?.toIntOrNull() ?:0
  print("\n How satisfied are u with our websites usability?")
  val x = readLine()?.toIntOrNull() ?:0
  print("\n How well did out support team address your concerns?")
  val p = readLine()?.toIntOrNull() ?:0
  print("\n This is your survey data?")
  print("\n")
  print("\n Service: $i")
  print("\n Usability: $y")
  print("\n Recommendation: $u")
  print("\n Satisfaction: $x")
   print("\n concerns: $p")
}
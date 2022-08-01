object question2 {
    def main (args: Array[String]):Unit = {
        def patternMatching(integer:Int):String = {
            integer match{
                case x if x <= 0 => "Negative/Zero"
                case x if x > 0 && x % 2 == 0 => "Even"
                case x if x > 0 && x % 2 == 1 => "Odd" 
            }
        }

    patternMatching(5)    
    }
}
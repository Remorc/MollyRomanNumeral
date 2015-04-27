/**
 * Created by cromer on 4/26/15.
 */
class RomanNumeralConverter {
    def convertArabicToRoman(number){
        def product = ""

        for (; number >= 1000; number -= 1000){
            product += "M"
        }

        if (number >= 500){
            product += "D"
            number -= 500
        }

        for (; number >= 100; number -= 100){
            product += "C"
        }

        if (number >= 50) {
            product += "L"
            number -= 50
        }

        for (; number >= 10; number -= 10){
            product += "X"
        }

        if (number >= 9){
            product += "IX"
            number -= 9
        }

        if (number >= 5){
            product += "V"
            number -= 5
        }

        if (number == 4){
            product += "IV"
            number -= 4
        }

        for (def tempNum = number; tempNum > 0; tempNum--) {
            product += "I"
        }

        return product
//
//        if (number == 1){
//            return "I"
//        }
//        if (number == 2){
//            return "II"
//        }
//        if (number == 3){
//            return "III"
//        }
//        if (number == 5){
//            return "V"
//        }
    }
}

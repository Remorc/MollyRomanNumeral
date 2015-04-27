import spock.lang.Specification
import spock.lang.Unroll

class GroovyAdderSpec extends Specification {

    @Unroll
    def "arabic to roman should convert #input to #expected properly"() {
        expect:
        RomanNumeralConverter converter = new RomanNumeralConverter()
        expected == converter.convertArabicToRoman(input)

        where:
        expected | input
        "I"      | 1
        "II"     | 2
        "III"    | 3
        "IV"     | 4
        "V"      | 5
        "VIII"   | 8
        "IX"     | 9
        "X"      | 10
        "XVIII"  | 18
        "XX"     | 20
        "L"      | 50
        "LXXXVIII" | 88
        "C"       | 100
        "CCC"    | 300
        "D"      | 500
        "M"      | 1000
        "MMM"    | 3000
    }

}
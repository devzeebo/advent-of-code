package com.devzeebo.adventofcode.twentyseventeen

class Day2_2 {
    static void main(def args) {
        def input = new File('inputs/day2').text.split(/\n/)

        println input.inject(0, { checksum, line ->
            def values = line.split(/\t/).collect(Integer.&parseInt)

            def pair = [values, values].combinations().find { it[0] - it[1] != 0 && ((int)(it[0] / it[1])) * it[1] == it[0] }
            checksum += pair[0] / pair[1]
        })
    }
}

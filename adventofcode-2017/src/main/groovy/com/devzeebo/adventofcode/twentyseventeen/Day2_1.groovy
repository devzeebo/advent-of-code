package com.devzeebo.adventofcode.twentyseventeen

class Day2_1 {
    static void main(def args) {
        def input = new File('inputs/day2').text.split(/\n/)

        println input.inject(0, { checksum, line ->
            def values = line.split(/\t/).collect(Integer.&parseInt)
            checksum += values.max() - values.min()
        })
    }
}

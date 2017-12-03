package com.devzeebo.adventofcode.twentyseventeen

class Day1_1 {

    static void main(def args) {
        def input = new File('inputs/day1_1').text.split('').collect(Integer.&parseInt)

        def idx = -1
        println input.inject(0, { total, it ->
            total += it == input[idx++] ? it : 0
        })
    }
}

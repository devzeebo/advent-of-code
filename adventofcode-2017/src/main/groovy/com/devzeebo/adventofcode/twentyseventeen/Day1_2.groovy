package com.devzeebo.adventofcode.twentyseventeen

class Day1_2 {
    static void main(def args) {
        def input = new File('inputs/day1_1').text.split('').collect(Integer.&parseInt)

        int halfway = input.size() / 2

        def idx = 0
        println input.inject(0, { total, it ->
            total += it == input[(idx++ - halfway)] ? it : 0
        })
    }
}

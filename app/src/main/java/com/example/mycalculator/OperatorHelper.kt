package com.example.mycalculator

import java.util.zip.DeflaterOutputStream

class OperatorHelper {

    companion object{
        fun add(left_hand_side:Double,right_hand_side:Double):Double = left_hand_side + right_hand_side
        fun mul(left_hand_side:Double,right_hand_side:Double):Double = left_hand_side * right_hand_side
        fun div(left_hand_side:Double,right_hand_side:Double):Double = left_hand_side / right_hand_side
        fun sub(left_hand_side:Double,right_hand_side:Double):Double = left_hand_side - right_hand_side
        fun mod(left_hand_side:Double,right_hand_side:Double):Double = left_hand_side % right_hand_side

    }
}
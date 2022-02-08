package com.techreturners.exercise003

class Exercise003 {

  def getIceCreamCode(iceCreamFlavour: String): Int = {
    val code = iceCreamFlavours.indexOf(iceCreamFlavour)
    if (code!= -1)
      code
    else
      throw new UnsupportedOperationException("Unknown ice-cream")
  }

  def iceCreamFlavours: Array[String] = {
//    throw new UnsupportedOperationException("You can delete this line and add your code here.")
    val iceCreamList = Array("Pistachio",
      "Raspberry Ripple",
      "Vanilla",
      "Mint Chocolate Chip",
      "Chocolate",
      "Mango Sorbet"
    )
    iceCreamList
  }

}

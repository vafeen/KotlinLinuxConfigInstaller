package ru.vafeen

fun String.getSudoCommand() =
    println("\nsudo ${this.substringAfter("sudo ")}")

fun String.getUserCommand() = println("\n$this")


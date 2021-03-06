package org.hexworks.cavesofzircon.view

import org.hexworks.zircon.api.input.Input

interface View {

    fun display()

    fun respondToUserInput(input: Input): View
}

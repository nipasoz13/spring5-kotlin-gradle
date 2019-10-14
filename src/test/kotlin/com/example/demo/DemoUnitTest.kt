package com.example.demo

import org.junit.jupiter.api.Assertions
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object DemoUnitTest : Spek({
    describe("Return Hello World!") {
        it("should send back the message") {
            // GIVEN
            val demoController = DemoController()
            val hello = demoController.hello()

            // THEN
            Assertions.assertEquals(Hello("Hello World !"), hello)
        }
    }
})
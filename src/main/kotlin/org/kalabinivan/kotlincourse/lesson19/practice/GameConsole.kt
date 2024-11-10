package org.kalabinivan.kotlincourse.lesson19.practice

open class GameConsole {
    fun startGame(gameName: String) {
            initHardWare()
            loadGame(gameName)
        }

        protected open fun initHardWare(){

        }

        private fun loadGame(gameName: String) {

        }
    }

    class Playstation : GameConsole() {
        override fun initHardWare() {
            super.initHardWare()
        }
    }
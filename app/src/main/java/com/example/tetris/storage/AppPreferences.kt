package com.example.tetris.storage

import android.content.Context
import android.content.SharedPreferences

class AppPreferences(ctx: Context) {
    private val strHighScore: String = "HIGH_SCORE"
    var data: SharedPreferences = ctx.getSharedPreferences("APP_PREFERENCES", Context.MODE_PRIVATE)

    fun saveHighScore(highScore: Int){
        data.edit().putInt(strHighScore, highScore).apply()
    }

    fun getHighScore(): Int{
        return data.getInt(strHighScore, 0)
    }

    fun clearHighScore(){
        saveHighScore(0)
    }
}

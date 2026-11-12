package kr.ac.kumoh._6.w26w11_thymeleaf

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class SongController {
    @GetMapping("/songs/random")
    fun getRandomSong(): String {
        return "random"
    }
}
package com.drpicox.game.players.api;

import com.drpicox.game.common.api.SuccessResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/players")
public class PlayersApi {

    @PostMapping
    public SuccessResponse newPlayer(@RequestBody NewPlayerForm form) {
        return new SuccessResponse("The " + form.getPlayerName() + " has been added successfully");
    }
}

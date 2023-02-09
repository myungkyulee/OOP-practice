package com.example.springtestlikelion.likelion.character;

import com.example.springtestlikelion.likelion.character.CharacterFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

class CharacterFactoryTest {

    @DisplayName("캐릭터공장은 String을 입력받아서 캐릭터를 생성한다.")
    @Test
    void 캐릭터공장_캐릭터_생성() {
        assertThatCode(() -> CharacterFactory.get("new Warrior()"))
                .doesNotThrowAnyException();
    }

}
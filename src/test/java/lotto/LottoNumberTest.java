package lotto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class LottoNumberTest {

    @Test
    @DisplayName("로또 번호인 int 를 Lotto Class 로 포장 후 생성")
    void create() {
        assertThat(new LottoNumber(1)).isEqualTo(new LottoNumber(1));
    }

    @Test
    @DisplayName("로또 번호는 1 ~ 45 이외의 숫자가 들어오면 예외를 던집니다.")
    void invalidLottoNumber() {
        assertThatThrownBy(() -> new LottoNumber(0))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
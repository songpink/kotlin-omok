package omok.model.search

import omok.model.Color
import omok.model.Color.BLACK
import omok.model.Color.NONE
import omok.model.fixture.createPlayingBoard
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class VerticalDfsTest {
    @ParameterizedTest
    @CsvSource(
        "BLACK,15,3,5",
        "WHITE,5,2,2",
    )
    fun `수직 dfs를 할 수 있다`(
        color: Color,
        row: Int,
        col: Int,
        count: Int,
    ) {
        // given
        val verticalDfs = VerticalDfs(createPlayingBoard())
        // when
        verticalDfs.search(color, row, col)
        // then
        assertThat(verticalDfs.count).isEqualTo(count)
    }

    @Test
    fun `가장자리 수직 dfs 테스트`() {
        val verticalDfs =
            VerticalDfs(
                arrayOf(
                    arrayOf(NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE),
                    arrayOf(NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE),
                    arrayOf(NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE),
                    arrayOf(NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE),
                    arrayOf(NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE),
                    arrayOf(NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE),
                    arrayOf(NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE),
                    arrayOf(NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE),
                    arrayOf(NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE),
                    arrayOf(NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE),
                    arrayOf(NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE),
                    arrayOf(NONE, BLACK, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE),
                    arrayOf(NONE, BLACK, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE),
                    arrayOf(NONE, BLACK, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE),
                    arrayOf(NONE, BLACK, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE),
                    arrayOf(NONE, BLACK, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE, NONE),
                ),
            )
        verticalDfs.search(BLACK, 15, 1)
        assertThat(verticalDfs.count).isEqualTo(5)
    }
}

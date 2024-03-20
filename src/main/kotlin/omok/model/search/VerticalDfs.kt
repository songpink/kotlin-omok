package omok.model.search

import omok.model.Color

class VerticalDfs(
    status: Array<Array<Color?>>,
) : Dfs(status) {
    override fun search(
        color: Color,
        row: Int,
        column: Int,
    ) {
        if (!isVisitedPosition(color, row, column)) return
        search(color, row + 1, column)
        search(color, row - 1, column)
    }
}

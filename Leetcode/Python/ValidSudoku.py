### Leetcode 36

def isValidSudoku(board):
    for row in board:
        print("Row is: ", row)
        for index in row:
            print("Index is: ", index)
            a = set()
            print(a)
            if index in a:
                #print("ENTER IF")
                return False
            else:
                #print("ENTER ELSE")
                a.add(index)

    for i in range(9):
        for row in board:
            b = set()
            if row[i] not in b:
                b.add(row[i])
            else:
                return False
    return True



board = [["5","3",".",".","5",".",".",".","."]
        ,["6",".",".","1","9","5",".",".","."]
        ,[".","9","8",".",".",".",".","6","."]
        ,["8",".",".",".","6",".",".",".","3"]
        ,["4",".",".","8",".","3",".",".","1"]
        ,["7",".",".",".","2",".",".",".","6"]
        ,[".","6",".",".",".",".","2","8","."]
        ,[".",".",".","4","1","9",".",".","5"]
        ,[".",".",".",".","8",".",".","7","9"]]


print(isValidSudoku(board))

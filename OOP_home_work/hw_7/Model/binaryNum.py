from Model.Interface.operation import Operatyon


class BinaryNum(Operatyon):
    def __init__(self, firstNumber, secondNumber):
        self.firstNumber = firstNumber
        self.secondNumber = secondNumber

    def __str__(self) -> str:
        return super().__str__()

    def sumElem(self):
        result = self.firstNumber + self.secondNumber
        return f"{result}"

    def divElem(self):
        result = self.firstNumber / self.secondNumber
        return f"{result}"

    def multiElem(self):
        result = self.firstNumber * self.secondNumber
        return f"{result}"

    def subtractionElement(self):
        result = self.firstNumber - self.secondNumber
        return f"{result}"


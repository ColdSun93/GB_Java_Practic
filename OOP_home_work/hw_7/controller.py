import view as vw
import Model
import Model.rationalNum as rn
import Model.complexNum as cn
import Model.binaryNum as bn
import logger as log


def button_click():
    log.loggingOper()
    num = vw.ViewMenu()
    log.do_something(f"Введено пользователем: {num}.")
    firstNumber =  vw.ViewWrite()
    log.do_something(f"Введено первое число: {firstNumber}.")
    secondNumber = vw.ViewWrite()
    log.do_something(f"Введено второе число: {secondNumber}.")
    match num:
        case 1:
            operations = rn.RationalNum(firstNumber, secondNumber)
        case 2:
            operations = cn.ComplexNum(complex(firstNumber), complex(secondNumber))
        case 3:
            operations = bn.BinaryNum(int(firstNumber, 2), int(secondNumber,2))
        case 4:
            exit()
    RationalNum(operations)
    log.do_something(f"Завершено.")    
    quit()

def RationalNum(operations):
    key = vw.ViewmenuRationalNum()
    log.do_something(f"Введена операция: {key}.")
    match key:
        case '+':
            res = operations.sumElem()
        case '-':
            res = operations.subtractionElement()
        case '*':
            res = operations.multiElem()
        case '/':
            res = operations.divElem()
        case 'Q':
            exit()
    print(f"{res} Назад")
    log.do_something(f"Результат операции: {res}.")
    log.do_something(f"Завершено.")   
    quit()

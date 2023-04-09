import logging

def loggingOper():
    logging.basicConfig(filename='OOP_home_work/hw_7/mylog.log', level=logging.INFO)
    logging.info('Started')


def do_something(message):
    logging.info(message)

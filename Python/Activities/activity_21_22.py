import pytest
import math

def test_add():
    num1 = 4
    num2 = 6
    assert(num1+ num2) == 10

def test_difference():
    num1 = 4
    num2 = 6
    assert(num2 - num1) == 10

@pytest.mark.activity
def test_multiply():
    num1 = 4
    num2 = 6
    assert(num1 * num2) == 24

@pytest.mark.activity
def test_divide():
    num1 = 4
    num2 = 6
    assert(num2 % num1) == 10
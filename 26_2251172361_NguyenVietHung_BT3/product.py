from abc import ABC, abstractmethod

# Interface
class Product(ABC):
    @abstractmethod
    def get_product_id(self) -> str:
        pass

    @abstractmethod
    def get_quantity(self) -> int:
        pass

    @abstractmethod
    def set_quantity(self, quantity: int):
        pass

# Implementation
class SimpleProduct(Product):
    def __init__(self, product_id: str, quantity: int):
        self._product_id = product_id
        self._quantity = quantity

    def get_product_id(self) -> str:
        return self._product_id

    def get_quantity(self) -> int:
        return self._quantity

    def set_quantity(self, quantity: int):
        self._quantity = quantity

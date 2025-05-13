from abc import ABC, abstractmethod
from product import Product, SimpleProduct

# Factory interface
class ProductFactory(ABC):
    @abstractmethod
    def create_product(self, product_id: str, quantity: int) -> Product:
        pass

# Factory implementation
class SimpleProductFactory(ProductFactory):
    def create_product(self, product_id: str, quantity: int) -> Product:
        return SimpleProduct(product_id, quantity)

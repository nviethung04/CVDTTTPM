from product_factory import SimpleProductFactory
from inventory_manager import InventoryManager

def main():
    factory = SimpleProductFactory()
    product = factory.create_product("P001", 100)

    manager = InventoryManager()
    manager.update_inventory(product, 20)
    manager.update_inventory(product, -10)

if __name__ == "__main__":
    main()

module order.management {
    exports com.example.order.management;
    requires order.storage;
    requires order.processing;
    requires static lombok;
}

> 单例模式保证了类在每个类加载器实例中只会有一个类实例对象，并提供了全局方法来访问这个单例对象

单例模式的几种实现：
- eagerly方式
	- 单例实例作为类属，在类加载时被实例化
- 加互斥锁的lazy方式
	- 单例实例作为类属，在第一次被访问时加锁实例化
- 利用volatile的lazy方式
	- 单例实例作为类属并用volatile修饰，在第一次被访问时先利用可见性判断是否已实例化，如果没有才加锁实例化，加锁后再二次判断是否实例化。适合高并发场景
- 利用静态内部类的lazy方式
	- 单例实例作为静态内部类的类属，在第一次被访问时通过加载静态内部类完成实例化，而静态内部类只有在被访问时加载，所以也是lazy方式，且是线程安全的
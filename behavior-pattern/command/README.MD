命令模式将面向对象里执行命令的函数对象化为执行者Command，Command只负责执行命令逻辑，不关心目标对象Target是谁，而Target也不知道被什么Command执行命令。业务方Client使用Invoker来发号施令，提供给Invoker实际的执行者和目标，Invoker发号施令的同时还提供命令的撤回和重做能力

命令模式：
- 命令模式包含四类元素：Command、Target、Invoker、Client
- 执行者Command专注于执行对目标Target的命令，而不关心Target具体是谁
- Invoker负责发号施令，不关心实际的执行者Command和目标Target是谁
	- Invoker内部通过维护执行者Command的undo和redo队列，回调command的undo/redo方法实现命令的撤销和重做
- Client操作Invoker来发号施令，指定实际的执行者Command和目标Target

Command模式的应用场景
- 回调函数建模
	- 回调函数对象化为命令Command
- 多级回退Undo操作
- 事务建模
	- 事务建模为Command，当事务失败时，回退到事务前的状态
	- Command具有公共接口，可让您以相同的方式调用所有事务
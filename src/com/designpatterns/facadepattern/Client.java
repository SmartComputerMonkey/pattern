package com.designpatterns.facadepattern;

/*门面模式讲解完毕，这是一个很好的封装方法，一个子系统比较复杂的实话，比如算法或者业务比较
复杂，就可以封装出一个或多个门面出来，项目的结构简单，而且扩展性非常好。还有，在一个较大项目
中的时候，为了避免人员带来的风险，也可以使用这个模式，技术水平比较差的成员，尽量安排独立的模
块（Sub System），然后把他写的程序封装到一个门面里，尽量让其他项目成员不用看到这些烂人的代码，
看也看不懂，我也遇到过一个“高人”写的代码，private 方法、构造函数、常量基本都不用，你要一个
public 方法，好，一个类里就一个public 方法，所有代码都在里面，然后你就看吧，一大坨的程序，看着
能把人逼疯，使用门面模式后，对门面进行单元测试，约束项目成员的代码质量，对项目整体质量的提升
也是一个比较好的帮助。*/
public class Client {
	
	public static void main(String[] args) {
		
		ModenPostOffice hellRoadPostOffice = new ModenPostOffice();
		
		String address = "Happy Road No. 666,God Province,Heaven";
		String context = "Hello,It's me,do you know who I am? I'm your old lover.I'd like to....";
		
		hellRoadPostOffice.sendLetter(context, address);
	}
}

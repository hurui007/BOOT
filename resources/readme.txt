/**
 * @title @ConfigurationProperties 将配置文件中的每一个值，映射到这个组件中，
 * prefix="person" 这个是指定具体的属性值
 * @author ruihu  
 * 同时只有这个组件是容器中的组件，才能使用容器提供的@ConfigurationProperties功能，
 * 所以还要加上component配置
 */
@Component
@ConfigurationProperties(prefix="person")

获取配置的值，还可以通过@value获取
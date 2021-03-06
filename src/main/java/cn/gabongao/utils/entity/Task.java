package cn.gabongao.utils.entity;


public interface Task {

    /**
     * unique id for a task.
     *
     * @return uuid
     */
    String getUUID();

    /**
     * site of a task
     *
     * @return site
     */
    Site getSite();

}
